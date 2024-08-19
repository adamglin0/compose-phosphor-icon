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

public val ThinGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.6f, 63.46f)
                arcTo(31.83f, 31.83f, 0.0f, false, false, 204.1f, 52.0f)
                horizontalLineTo(204.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -59.17f, 17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.51f, 5.0f)
                lineTo(74.0f, 144.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, 0.51f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 51.9f, 204.0f)
                horizontalLineTo(52.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 59.16f, -17.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.51f, -5.0f)
                lineTo(182.0f, 111.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, -0.51f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 228.6f, 63.46f)
                close()
                moveTo(222.1f, 99.8f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -30.8f, 4.55f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.37f, 106.0f)
                lineTo(106.0f, 176.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.63f, 14.93f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -44.09f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.12f, -3.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, -1.17f)
                arcToRelative(4.32f, 4.32f, 0.0f, false, false, -0.62f, 0.05f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 9.0f, -44.09f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 79.63f, 150.0f)
                lineTo(150.0f, 79.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.63f, -14.93f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 44.09f, -9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.57f, 4.57f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 222.1f, 99.8f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
