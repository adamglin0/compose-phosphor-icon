package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Starhalf: ImageVector
    get() {
        if (_starhalf != null) {
            return _starhalf!!
        }
        _starhalf = Builder(name = "Starhalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.18f, 97.26f)
                arcTo(16.38f, 16.38f, 0.0f, false, false, 224.92f, 86.0f)
                lineToRelative(-59.0f, -4.76f)
                lineTo(143.14f, 26.15f)
                arcToRelative(16.36f, 16.36f, 0.0f, false, false, -30.27f, 0.0f)
                lineTo(90.11f, 81.23f)
                lineTo(31.08f, 86.0f)
                arcToRelative(16.46f, 16.46f, 0.0f, false, false, -9.37f, 28.86f)
                lineToRelative(45.0f, 38.83f)
                lineTo(53.0f, 211.75f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 24.5f, 17.82f)
                lineTo(128.0f, 198.49f)
                lineToRelative(50.53f, 31.08f)
                arcTo(16.4f, 16.4f, 0.0f, false, false, 203.0f, 211.75f)
                lineToRelative(-13.76f, -58.07f)
                lineToRelative(45.0f, -38.83f)
                arcTo(16.43f, 16.43f, 0.0f, false, false, 239.18f, 97.26f)
                close()
                moveTo(223.84f, 102.73f)
                lineTo(175.14f, 144.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, 7.91f)
                lineToRelative(14.88f, 62.8f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, 0.48f)
                curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0.0f)
                lineToRelative(-54.72f, -33.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 181.1f)
                lineTo(128.0f, 32.0f)
                curveToRelative(0.24f, 0.0f, 0.27f, 0.08f, 0.35f, 0.26f)
                lineTo(153.0f, 91.86f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, 4.92f)
                lineToRelative(63.91f, 5.16f)
                curveToRelative(0.16f, 0.0f, 0.25f, 0.0f, 0.34f, 0.29f)
                reflectiveCurveTo(224.0f, 102.63f, 223.84f, 102.73f)
                close()
            }
        }
        .build()
        return _starhalf!!
    }

private var _starhalf: ImageVector? = null
