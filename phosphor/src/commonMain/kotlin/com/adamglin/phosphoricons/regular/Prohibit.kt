package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Prohibit: ImageVector
    get() {
        if (_prohibit != null) {
            return _prohibit!!
        }
        _prohibit = Builder(name = "Prohibit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.56f, 87.56f, 0.0f, false, true, -20.41f, 56.28f)
                lineTo(71.72f, 60.4f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(87.56f, 87.56f, 0.0f, false, true, 60.41f, 71.72f)
                lineTo(184.28f, 195.6f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
            }
        }
        .build()
        return _prohibit!!
    }

private var _prohibit: ImageVector? = null
