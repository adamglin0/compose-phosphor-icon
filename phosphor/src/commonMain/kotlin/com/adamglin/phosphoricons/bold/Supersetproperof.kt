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

public val BoldGroup.Supersetproperof: ImageVector
    get() {
        if (_supersetproperof != null) {
            return _supersetproperof!!
        }
        _supersetproperof = Builder(name = "Supersetproperof", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, -92.0f, 92.0f)
                horizontalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -136.0f)
                horizontalLineTo(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(72.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _supersetproperof!!
    }

private var _supersetproperof: ImageVector? = null
