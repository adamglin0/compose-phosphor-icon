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

public val ThinGroup.Wifix: ImageVector
    get() {
        if (_wifix != null) {
            return _wifix!!
        }
        _wifix = Builder(name = "Wifix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 204.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 204.0f)
                close()
                moveTo(205.66f, 80.0f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(200.0f, 74.34f)
                lineTo(178.83f, 53.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(194.34f, 80.0f)
                lineToRelative(-21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(200.0f, 85.66f)
                lineToRelative(21.17f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
                moveTo(170.35f, 161.77f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -84.71f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.71f, 6.46f)
                arcToRelative(64.05f, 64.05f, 0.0f, false, true, 75.29f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.71f, -6.46f)
                close()
                moveTo(135.81f, 60.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.38f, -8.0f)
                curveToRelative(-2.71f, -0.13f, -5.47f, -0.2f, -8.19f, -0.2f)
                arcTo(168.33f, 168.33f, 0.0f, false, false, 21.46f, 90.09f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.08f, 6.19f)
                arcTo(160.22f, 160.22f, 0.0f, false, true, 128.0f, 60.0f)
                curveTo(130.59f, 60.0f, 133.22f, 60.06f, 135.81f, 60.19f)
                close()
                moveTo(135.73f, 108.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.54f, -8.0f)
                curveToRelative(-2.74f, -0.19f, -5.52f, -0.28f, -8.27f, -0.28f)
                arcToRelative(118.72f, 118.72f, 0.0f, false, false, -74.48f, 25.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 6.27f)
                arcTo(110.84f, 110.84f, 0.0f, false, true, 128.0f, 108.0f)
                curveTo(130.57f, 108.0f, 133.17f, 108.09f, 135.73f, 108.26f)
                close()
            }
        }
        .build()
        return _wifix!!
    }

private var _wifix: ImageVector? = null
