package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Biohazard: ImageVector
    get() {
        if (_biohazard != null) {
            return _biohazard!!
        }
        _biohazard = Builder(name = "Biohazard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.26f, 100.55f)
                curveToRelative(-0.37f, -0.71f, -0.76f, -1.42f, -1.16f, -2.11f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -29.55f, -81.29f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -11.1f, 21.28f)
                arcTo(39.91f, 39.91f, 0.0f, false, true, 168.0f, 73.92f)
                curveToRelative(0.0f, 1.0f, -0.05f, 2.0f, -0.13f, 3.0f)
                arcToRelative(67.79f, 67.79f, 0.0f, false, false, -79.74f, 0.0f)
                curveToRelative(-0.08f, -1.0f, -0.13f, -2.0f, -0.13f, -3.0f)
                arcToRelative(39.92f, 39.92f, 0.0f, false, true, 21.55f, -35.5f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 98.46f, 17.14f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 68.89f, 98.45f)
                curveToRelative(-0.4f, 0.7f, -0.78f, 1.39f, -1.15f, 2.1f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 12.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 24.18f, -36.73f)
                curveToRelative(-0.11f, 1.56f, -0.18f, 3.14f, -0.18f, 4.73f)
                arcToRelative(68.12f, 68.12f, 0.0f, false, false, 41.63f, 62.68f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -47.16f, 3.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.94f, 20.21f)
                arcTo(63.95f, 63.95f, 0.0f, false, false, 128.0f, 201.24f)
                arcToRelative(63.95f, 63.95f, 0.0f, false, false, 86.47f, 16.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.94f, -20.21f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -47.16f, -3.0f)
                arcTo(68.12f, 68.12f, 0.0f, false, false, 196.0f, 132.0f)
                curveToRelative(0.0f, -1.59f, -0.07f, -3.17f, -0.18f, -4.73f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 220.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 188.26f, 100.55f)
                close()
                moveTo(128.0f, 88.0f)
                arcToRelative(43.85f, 43.85f, 0.0f, false, true, 30.23f, 12.07f)
                arcToRelative(39.93f, 39.93f, 0.0f, false, true, -60.46f, 0.0f)
                arcTo(43.81f, 43.81f, 0.0f, false, true, 128.0f, 88.0f)
                close()
                moveTo(84.0f, 132.0f)
                arcToRelative(44.35f, 44.35f, 0.0f, false, true, 0.57f, -7.06f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 30.18f, 49.0f)
                arcTo(44.08f, 44.08f, 0.0f, false, true, 84.0f, 132.0f)
                close()
                moveTo(141.25f, 174.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 30.18f, -49.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -30.18f, 49.0f)
                close()
            }
        }
        .build()
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
