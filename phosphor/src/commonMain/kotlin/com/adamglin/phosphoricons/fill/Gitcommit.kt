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

public val FillGroup.Gitcommit: ImageVector
    get() {
        if (_gitcommit != null) {
            return _gitcommit!!
        }
        _gitcommit = Builder(name = "Gitcommit", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(183.42f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -110.84f, 0.0f)
                horizontalLineTo(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(72.58f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 110.84f, 0.0f)
                horizontalLineTo(248.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 128.0f)
                close()
            }
        }
        .build()
        return _gitcommit!!
    }

private var _gitcommit: ImageVector? = null
