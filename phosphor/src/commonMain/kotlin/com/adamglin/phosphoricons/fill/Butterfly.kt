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

public val FillGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 100.17f)
                arcToRelative(108.42f, 108.42f, 0.0f, false, false, -8.0f, -12.64f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineTo(87.53f)
                arcTo(108.42f, 108.42f, 0.0f, false, false, 128.0f, 100.17f)
                close()
                moveTo(232.7f, 50.48f)
                curveTo(229.0f, 45.7f, 221.84f, 40.0f, 209.0f, 40.0f)
                curveToRelative(-16.85f, 0.0f, -38.46f, 11.28f, -57.81f, 30.16f)
                arcTo(140.07f, 140.07f, 0.0f, false, false, 136.0f, 87.53f)
                verticalLineTo(180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(87.53f)
                arcToRelative(140.07f, 140.07f, 0.0f, false, false, -15.15f, -17.37f)
                curveTo(85.49f, 51.28f, 63.88f, 40.0f, 47.0f, 40.0f)
                curveTo(34.16f, 40.0f, 27.0f, 45.7f, 23.3f, 50.48f)
                curveToRelative(-6.82f, 8.77f, -12.18f, 24.08f, -0.21f, 71.2f)
                curveToRelative(6.05f, 23.83f, 19.51f, 33.0f, 30.63f, 36.42f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 205.27f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 74.28f, -47.17f)
                curveToRelative(11.12f, -3.4f, 24.57f, -12.59f, 30.63f, -36.42f)
                curveTo(239.63f, 95.24f, 244.85f, 66.1f, 232.7f, 50.48f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
