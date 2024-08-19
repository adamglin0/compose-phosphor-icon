package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Mouse-middle-click-light`: ImageVector
    get() {
        if (`_mouse-middle-click-light` != null) {
            return `_mouse-middle-click-light`!!
        }
        `_mouse-middle-click-light` = Builder(name = "Mouse-middle-click-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 18.0f)
                lineTo(112.0f, 18.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 50.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, -62.0f)
                lineTo(206.0f, 80.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 144.0f, 18.0f)
                close()
                moveTo(194.0f, 80.0f)
                verticalLineToRelative(26.0f)
                lineTo(150.0f, 106.0f)
                lineTo(150.0f, 88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(134.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 194.0f, 80.0f)
                close()
                moveTo(118.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(120.0f, 138.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(112.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                lineTo(122.0f, 74.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(18.0f)
                lineTo(62.0f, 106.0f)
                lineTo(62.0f, 80.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 112.0f, 30.0f)
                close()
                moveTo(144.0f, 226.0f)
                lineTo(112.0f, 226.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(62.0f, 118.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(150.0f, 118.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(58.0f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 144.0f, 226.0f)
                close()
            }
        }
        .build()
        return `_mouse-middle-click-light`!!
    }

private var `_mouse-middle-click-light`: ImageVector? = null
