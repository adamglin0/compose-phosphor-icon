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

public val LightGroup.`Blueprint-light`: ImageVector
    get() {
        if (`_blueprint-light` != null) {
            return `_blueprint-light`!!
        }
        `_blueprint-light` = Builder(name = "Blueprint-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 58.0f)
                lineTo(70.0f, 58.0f)
                lineTo(70.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(48.0f, 34.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 176.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, 30.0f)
                lineTo(232.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(238.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 58.0f)
                close()
                moveTo(30.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 48.0f, 46.0f)
                lineTo(58.0f, 46.0f)
                lineTo(58.0f, 146.0f)
                lineTo(48.0f, 146.0f)
                arcToRelative(29.87f, 29.87f, 0.0f, false, false, -18.0f, 6.0f)
                close()
                moveTo(226.0f, 194.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -36.0f)
                lineTo(64.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(70.0f, 70.0f)
                lineTo(226.0f, 70.0f)
                close()
                moveTo(104.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 150.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 150.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(174.0f, 138.0f)
                lineTo(174.0f, 118.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(174.0f, 106.0f)
                lineTo(174.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                lineTo(134.0f, 106.0f)
                lineTo(134.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                lineTo(104.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(134.0f, 118.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(20.0f)
                lineTo(134.0f, 138.0f)
                close()
            }
        }
        .build()
        return `_blueprint-light`!!
    }

private var `_blueprint-light`: ImageVector? = null
