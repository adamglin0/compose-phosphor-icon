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

public val ThinGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.26f, 84.89f)
                arcToRelative(100.16f, 100.16f, 0.0f, true, true, -22.44f, -30.37f)
                lineToRelative(25.35f, -25.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(31.0f, -31.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 15.78f, 31.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, -0.46f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, -18.1f, -36.51f)
                lineToRelative(28.34f, -28.33f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 63.0f, 193.05f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 211.0f, 88.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.22f, -3.44f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
