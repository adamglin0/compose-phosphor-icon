package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 120.0f)
                arcToRelative(46.05f, 46.05f, 0.0f, false, false, -46.0f, -46.0f)
                lineTo(160.15f, 74.0f)
                curveToRelative(-2.58f, -0.15f, -54.1f, -3.57f, -103.15f, -44.71f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 40.0f)
                lineTo(34.0f, 200.0f)
                arcToRelative(13.85f, 13.85f, 0.0f, false, false, 8.07f, 12.68f)
                arcTo(14.16f, 14.16f, 0.0f, false, false, 48.0f, 214.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.0f, -3.3f)
                curveToRelative(40.0f, -33.52f, 81.57f, -42.0f, 97.0f, -44.07f)
                verticalLineToRelative(34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.23f, 11.65f)
                lineToRelative(11.0f, 7.33f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 21.32f, -8.17f)
                lineToRelative(12.13f, -45.71f)
                arcTo(46.07f, 46.07f, 0.0f, false, false, 246.0f, 120.0f)
                close()
                moveTo(49.29f, 201.52f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 200.0f)
                lineTo(46.0f, 40.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.15f, -1.8f)
                arcTo(2.08f, 2.08f, 0.0f, false, true, 48.0f, 38.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 1.26f, 0.48f)
                curveToRelative(44.0f, 36.92f, 89.0f, 45.19f, 104.71f, 47.0f)
                verticalLineToRelative(69.0f)
                curveTo(138.29f, 156.33f, 93.3f, 164.61f, 49.29f, 201.52f)
                close()
                moveTo(180.93f, 208.52f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.05f, 1.18f)
                lineToRelative(-11.0f, -7.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, -1.67f)
                lineTo(165.99f, 166.0f)
                horizontalLineToRelative(26.2f)
                close()
                moveTo(200.0f, 154.0f)
                lineTo(166.0f, 154.0f)
                lineTo(166.0f, 86.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
