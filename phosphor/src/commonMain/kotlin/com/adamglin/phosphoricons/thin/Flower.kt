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

public val ThinGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.35f, 132.82f)
                arcTo(50.92f, 50.92f, 0.0f, false, false, 195.76f, 128.0f)
                arcToRelative(50.92f, 50.92f, 0.0f, false, false, 12.59f, -4.82f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -62.36f)
                arcToRelative(51.54f, 51.54f, 0.0f, false, false, -10.47f, 8.5f)
                arcTo(51.27f, 51.27f, 0.0f, false, false, 164.0f, 56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                arcToRelative(51.27f, 51.27f, 0.0f, false, false, 2.12f, 13.32f)
                arcToRelative(51.54f, 51.54f, 0.0f, false, false, -10.47f, -8.5f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 62.36f)
                arcTo(50.92f, 50.92f, 0.0f, false, false, 60.24f, 128.0f)
                arcToRelative(50.92f, 50.92f, 0.0f, false, false, -12.59f, 4.82f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 62.36f)
                arcToRelative(51.54f, 51.54f, 0.0f, false, false, 10.47f, -8.5f)
                arcTo(51.27f, 51.27f, 0.0f, false, false, 92.0f, 200.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(51.27f, 51.27f, 0.0f, false, false, -2.12f, -13.32f)
                arcToRelative(51.54f, 51.54f, 0.0f, false, false, 10.47f, 8.5f)
                arcToRelative(35.85f, 35.85f, 0.0f, false, false, 18.0f, 4.84f)
                arcToRelative(36.24f, 36.24f, 0.0f, false, false, 9.37f, -1.25f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 8.68f, -66.0f)
                close()
                moveTo(176.35f, 67.75f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 48.5f)
                curveToRelative(-6.95f, 4.0f, -19.82f, 6.66f, -37.44f, 7.74f)
                lineToRelative(-3.16f, -0.17f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -14.26f, -24.68f)
                curveToRelative(0.49f, -1.0f, 1.0f, -1.9f, 1.44f, -2.84f)
                curveTo(160.67f, 81.59f, 169.4f, 71.77f, 176.35f, 67.75f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
                moveTo(128.0f, 28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                curveToRelative(0.0f, 8.0f, -4.14f, 20.5f, -12.0f, 36.3f)
                curveToRelative(-0.58f, 0.87f, -1.15f, 1.75f, -1.73f, 2.65f)
                arcToRelative(35.94f, 35.94f, 0.0f, false, false, -28.52f, 0.0f)
                curveToRelative(-0.58f, -0.9f, -1.15f, -1.78f, -1.73f, -2.65f)
                curveTo(104.14f, 76.5f, 100.0f, 64.0f, 100.0f, 56.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 28.0f)
                close()
                moveTo(51.65f, 116.25f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -48.5f)
                curveToRelative(6.95f, 4.0f, 15.68f, 13.84f, 25.42f, 28.55f)
                curveToRelative(0.47f, 0.94f, 1.0f, 1.88f, 1.44f, 2.84f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -14.26f, 24.68f)
                lineToRelative(-3.16f, 0.17f)
                curveTo(71.47f, 122.91f, 58.6f, 120.26f, 51.65f, 116.25f)
                close()
                moveTo(79.65f, 188.25f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -48.5f)
                curveToRelative(7.0f, -4.0f, 19.82f, -6.66f, 37.44f, -7.74f)
                lineToRelative(3.16f, 0.17f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 14.26f, 24.68f)
                curveToRelative(-0.49f, 1.0f, -1.0f, 1.9f, -1.44f, 2.84f)
                curveTo(95.33f, 174.41f, 86.6f, 184.23f, 79.65f, 188.25f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                curveToRelative(0.0f, -8.0f, 4.14f, -20.5f, 12.0f, -36.3f)
                curveToRelative(0.58f, -0.87f, 1.15f, -1.75f, 1.73f, -2.65f)
                arcToRelative(35.94f, 35.94f, 0.0f, false, false, 28.52f, 0.0f)
                curveToRelative(0.58f, 0.9f, 1.15f, 1.78f, 1.73f, 2.65f)
                curveToRelative(7.87f, 15.8f, 12.0f, 28.27f, 12.0f, 36.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 228.0f)
                close()
                moveTo(214.6f, 178.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -38.25f, 10.25f)
                curveToRelative(-6.95f, -4.0f, -15.68f, -13.84f, -25.42f, -28.55f)
                curveToRelative(-0.47f, -0.94f, -1.0f, -1.88f, -1.44f, -2.84f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 14.26f, -24.68f)
                lineToRelative(3.16f, -0.17f)
                curveToRelative(17.62f, 1.08f, 30.49f, 3.73f, 37.44f, 7.74f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 214.6f, 178.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
