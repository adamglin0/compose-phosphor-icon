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

public val FillGroup.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) {
            return _vinylRecord!!
        }
        _vinylRecord = Builder(name = "VinylRecord", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(72.08f, 72.08f, 0.0f, false, true, 72.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 72.0f, 128.0f)
                close()
                moveTo(104.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
