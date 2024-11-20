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

public val FillGroup.Spiral: ImageVector
    get() {
        if (_spiral != null) {
            return _spiral!!
        }
        _spiral = Builder(name = "Spiral", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, -96.0f)
                curveToRelative(-1.4f, 0.0f, -2.8f, 0.0f, -4.18f, 0.1f)
                arcTo(80.06f, 80.06f, 0.0f, false, false, 56.0f, 128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, true, 64.0f, -64.0f)
                arcToRelative(80.09f, 80.09f, 0.0f, false, true, 80.0f, 80.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, -88.0f, 88.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, true, -96.0f, -96.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 136.0f, 32.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, true, 248.0f, 144.0f)
                close()
            }
        }
        .build()
        return _spiral!!
    }

private var _spiral: ImageVector? = null
