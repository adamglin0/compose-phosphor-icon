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

public val BoldGroup.BeachBall: ImageVector
    get() {
        if (_beachBall != null) {
            return _beachBall!!
        }
        _beachBall = Builder(name = "BeachBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.26f, 84.26f, 0.0f, false, true, -1.32f, 14.74f)
                arcToRelative(204.79f, 204.79f, 0.0f, false, false, -18.52f, -31.49f)
                arcToRelative(176.78f, 176.78f, 0.0f, false, true, 19.08f, 5.62f)
                arcTo(85.0f, 85.0f, 0.0f, false, true, 212.0f, 128.0f)
                close()
                moveTo(202.39f, 89.06f)
                arcToRelative(204.25f, 204.25f, 0.0f, false, false, -30.0f, -5.47f)
                arcToRelative(204.25f, 204.25f, 0.0f, false, false, -5.47f, -30.0f)
                arcTo(84.53f, 84.53f, 0.0f, false, true, 202.39f, 89.06f)
                close()
                moveTo(139.13f, 44.76f)
                arcToRelative(176.78f, 176.78f, 0.0f, false, true, 5.62f, 19.08f)
                arcToRelative(204.79f, 204.79f, 0.0f, false, false, -31.49f, -18.52f)
                arcToRelative(82.49f, 82.49f, 0.0f, false, true, 25.87f, -0.56f)
                close()
                moveTo(81.07f, 58.36f)
                arcToRelative(179.84f, 179.84f, 0.0f, false, true, 49.8f, 25.06f)
                arcToRelative(204.19f, 204.19f, 0.0f, false, false, -85.23f, 28.05f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 81.07f, 58.36f)
                close()
                moveTo(45.0f, 140.65f)
                arcToRelative(180.19f, 180.19f, 0.0f, false, true, 104.62f, -34.22f)
                arcToRelative(180.19f, 180.19f, 0.0f, false, true, -34.22f, 104.62f)
                arcTo(84.22f, 84.22f, 0.0f, false, true, 45.0f, 140.65f)
                close()
                moveTo(144.58f, 210.36f)
                arcToRelative(204.19f, 204.19f, 0.0f, false, false, 28.05f, -85.23f)
                arcToRelative(179.84f, 179.84f, 0.0f, false, true, 25.06f, 49.8f)
                arcTo(84.23f, 84.23f, 0.0f, false, true, 144.53f, 210.36f)
                close()
            }
        }
        .build()
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
