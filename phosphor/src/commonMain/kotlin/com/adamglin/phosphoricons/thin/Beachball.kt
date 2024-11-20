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

public val ThinGroup.BeachBall: ImageVector
    get() {
        if (_beachBall != null) {
            return _beachBall!!
        }
        _beachBall = Builder(name = "BeachBall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(216.14f, 101.64f)
                arcTo(195.13f, 195.13f, 0.0f, false, false, 165.0f, 91.0f)
                arcToRelative(195.13f, 195.13f, 0.0f, false, false, -10.68f, -51.1f)
                arcTo(92.33f, 92.33f, 0.0f, false, true, 216.14f, 101.64f)
                close()
                moveTo(145.0f, 37.58f)
                arcTo(187.54f, 187.54f, 0.0f, false, true, 156.3f, 83.26f)
                arcTo(196.37f, 196.37f, 0.0f, false, false, 89.67f, 44.38f)
                arcTo(91.34f, 91.34f, 0.0f, false, true, 128.0f, 36.0f)
                arcTo(92.41f, 92.41f, 0.0f, false, true, 145.0f, 37.58f)
                close()
                moveTo(79.86f, 49.63f)
                arcToRelative(188.08f, 188.08f, 0.0f, false, true, 72.45f, 40.82f)
                arcTo(196.19f, 196.19f, 0.0f, false, false, 36.0f, 127.39f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 79.86f, 49.63f)
                close()
                moveTo(36.44f, 137.0f)
                arcToRelative(188.17f, 188.17f, 0.0f, false, true, 121.0f, -38.48f)
                arcToRelative(188.17f, 188.17f, 0.0f, false, true, -38.48f, 121.0f)
                arcTo(92.17f, 92.17f, 0.0f, false, true, 36.44f, 137.0f)
                close()
                moveTo(128.61f, 220.0f)
                arcToRelative(196.19f, 196.19f, 0.0f, false, false, 36.94f, -116.3f)
                arcToRelative(188.08f, 188.08f, 0.0f, false, true, 40.82f, 72.45f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 128.61f, 220.0f)
                close()
                moveTo(211.61f, 166.34f)
                arcTo(196.37f, 196.37f, 0.0f, false, false, 172.74f, 99.7f)
                arcTo(187.54f, 187.54f, 0.0f, false, true, 218.42f, 111.0f)
                arcTo(92.41f, 92.41f, 0.0f, false, true, 220.0f, 128.0f)
                arcTo(91.34f, 91.34f, 0.0f, false, true, 211.62f, 166.33f)
                close()
            }
        }
        .build()
        return _beachBall!!
    }

private var _beachBall: ImageVector? = null
