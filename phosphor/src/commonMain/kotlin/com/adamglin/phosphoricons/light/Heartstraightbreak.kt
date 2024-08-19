package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Heartstraightbreak: ImageVector
    get() {
        if (_heartstraightbreak != null) {
            return _heartstraightbreak!!
        }
        _heartstraightbreak = Builder(name = "Heartstraightbreak", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.62f, 58.38f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -79.16f, 0.0f)
                lineTo(128.0f, 72.24f)
                lineToRelative(-14.44f, -13.9f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -79.2f, 79.21f)
                lineToRelative(89.37f, 90.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.55f, 0.0f)
                lineToRelative(89.33f, -90.63f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 221.62f, 58.38f)
                close()
                moveTo(213.11f, 129.13f)
                lineTo(128.0f, 215.45f)
                lineTo(42.89f, 129.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.23f, -62.24f)
                lineToRelative(0.08f, 0.08f)
                lineToRelative(14.16f, 13.64f)
                lineTo(107.85f, 91.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.08f, 8.56f)
                lineTo(135.53f, 128.0f)
                lineToRelative(-11.76f, 11.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.49f)
                lineTo(120.58f, 96.06f)
                lineToRelative(30.24f, -29.12f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, 0.08f, -0.08f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 62.21f, 62.27f)
                close()
            }
        }
        .build()
        return _heartstraightbreak!!
    }

private var _heartstraightbreak: ImageVector? = null
