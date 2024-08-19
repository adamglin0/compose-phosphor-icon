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

public val LightGroup.`Building-light`: ImageVector
    get() {
        if (`_building-light` != null) {
            return `_building-light`!!
        }
        `_building-light` = Builder(name = "Building-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 226.0f)
                lineTo(206.0f, 226.0f)
                lineTo(206.0f, 30.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(40.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(50.0f, 30.0f)
                lineTo(50.0f, 226.0f)
                lineTo(24.0f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(232.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(62.0f, 30.0f)
                lineTo(194.0f, 30.0f)
                lineTo(194.0f, 226.0f)
                lineTo(158.0f, 226.0f)
                lineTo(158.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(104.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(42.0f)
                lineTo(62.0f, 226.0f)
                close()
                moveTo(146.0f, 226.0f)
                lineTo(110.0f, 226.0f)
                lineTo(110.0f, 190.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(90.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 64.0f)
                close()
                moveTo(138.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(144.0f, 70.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 64.0f)
                close()
                moveTo(90.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 104.0f)
                close()
                moveTo(138.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(144.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 104.0f)
                close()
                moveTo(96.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(138.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(144.0f, 150.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 138.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_building-light`!!
    }

private var `_building-light`: ImageVector? = null
