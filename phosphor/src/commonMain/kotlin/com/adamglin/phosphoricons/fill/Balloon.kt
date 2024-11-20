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

public val FillGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, -88.0f, 88.0f)
                curveToRelative(0.0f, 23.43f, 9.4f, 49.42f, 25.13f, 69.5f)
                curveToRelative(12.08f, 15.41f, 26.5f, 26.0f, 41.91f, 31.09f)
                lineTo(96.65f, 228.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 240.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.35f, -11.15f)
                lineTo(149.0f, 204.59f)
                curveToRelative(15.4f, -5.07f, 29.83f, -15.68f, 41.91f, -31.09f)
                curveTo(206.6f, 153.42f, 216.0f, 127.43f, 216.0f, 104.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(177.32f, 103.89f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.68f)
                arcToRelative(41.29f, 41.29f, 0.0f, false, false, -33.43f, -33.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 2.64f, -15.78f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, true, 46.57f, 46.57f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 177.32f, 103.89f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
