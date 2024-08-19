package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Earslash: ImageVector
    get() {
        if (_earslash != null) {
            return _earslash!!
        }
        _earslash = Builder(name = "Earslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(58.23f, 57.2f)
                arcTo(83.38f, 83.38f, 0.0f, false, false, 44.0f, 104.0f)
                curveToRelative(0.0f, 31.79f, 11.28f, 42.68f, 21.24f, 52.28f)
                curveTo(73.16f, 163.91f, 80.0f, 170.51f, 80.0f, 188.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                curveToRelative(13.71f, 0.0f, 25.52f, -5.87f, 35.08f, -17.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.16f, -5.1f)
                curveTo(148.83f, 223.24f, 139.37f, 228.0f, 128.0f, 228.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                curveToRelative(0.0f, -20.89f, -8.75f, -29.33f, -17.21f, -37.48f)
                curveTo(61.55f, 141.61f, 52.0f, 132.4f, 52.0f, 104.0f)
                arcTo(75.36f, 75.36f, 0.0f, false, true, 63.8f, 63.33f)
                lineToRelative(23.0f, 25.27f)
                arcTo(43.73f, 43.73f, 0.0f, false, false, 84.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, true, 1.0f, -8.53f)
                lineTo(141.65f, 149.0f)
                arcTo(37.0f, 37.0f, 0.0f, false, false, 140.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.24f, 18.21f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(160.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                arcToRelative(29.55f, 29.55f, 0.0f, false, true, 0.24f, -3.79f)
                lineToRelative(14.13f, 15.55f)
                arcTo(12.37f, 12.37f, 0.0f, false, true, 160.0f, 172.0f)
                close()
                moveTo(83.55f, 37.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.37f, -5.49f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 212.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 89.0f, 38.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 83.55f, 37.36f)
                close()
                moveTo(160.44f, 118.17f)
                arcTo(29.85f, 29.85f, 0.0f, false, false, 164.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -47.68f, -34.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.59f, -7.57f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 104.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -4.46f, 17.84f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 124.0f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.83f, -0.45f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.44f, 118.17f)
                close()
            }
        }
        .build()
        return _earslash!!
    }

private var _earslash: ImageVector? = null
