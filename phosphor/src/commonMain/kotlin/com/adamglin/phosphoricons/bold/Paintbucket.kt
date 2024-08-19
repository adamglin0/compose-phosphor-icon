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

public val BoldGroup.Paintbucket: ImageVector
    get() {
        if (_paintbucket != null) {
            return _paintbucket!!
        }
        _paintbucket = Builder(name = "Paintbucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.79f, 142.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, -19.87f)
                lineTo(125.0f, 7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(70.25f, 45.29f)
                lineTo(48.48f, 23.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(53.28f, 62.26f)
                lineTo(12.2f, 103.35f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(84.86f, 84.86f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(214.48f, 150.0f)
                close()
                moveTo(204.21f, 128.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.7f, 2.9f)
                lineToRelative(-79.82f, 79.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(29.17f, 126.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineTo(70.25f, 79.24f)
                lineToRelative(24.29f, 24.29f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 52.09f, 35.11f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -35.12f, -52.08f)
                lineTo(87.23f, 62.26f)
                lineTo(116.52f, 33.0f)
                lineToRelative(93.27f, 93.28f)
                close()
                moveTo(118.34f, 110.36f)
                lineTo(118.34f, 110.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -0.06f, 0.06f)
                close()
                moveTo(256.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                curveToRelative(0.0f, -19.44f, 12.93f, -37.23f, 14.4f, -39.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, 0.0f)
                curveTo(243.07f, 170.78f, 256.0f, 188.57f, 256.0f, 208.0f)
                close()
            }
        }
        .build()
        return _paintbucket!!
    }

private var _paintbucket: ImageVector? = null
