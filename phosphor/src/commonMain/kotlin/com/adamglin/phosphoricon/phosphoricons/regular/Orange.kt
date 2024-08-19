package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Orange: ImageVector
    get() {
        if (_orange != null) {
            return _orange!!
        }
        _orange = Builder(name = "Orange", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.87f, 72.58f)
                arcTo(64.06f, 64.06f, 0.0f, false, false, 200.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -56.0f, 33.06f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 72.0f, 8.0f)
                lineTo(64.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(48.08f, 48.08f, 0.0f, false, true, 47.4f, 40.42f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 46.47f, 8.16f)
                close()
                moveTo(183.33f, 24.0f)
                arcToRelative(48.09f, 48.09f, 0.0f, false, true, -46.66f, 40.0f)
                arcTo(48.09f, 48.09f, 0.0f, false, true, 183.33f, 24.0f)
                close()
                moveTo(128.0f, 224.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 224.0f)
                close()
                moveTo(183.89f, 161.32f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, true, -46.57f, 46.57f)
                arcTo(8.52f, 8.52f, 0.0f, false, true, 136.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.31f, -15.89f)
                arcToRelative(41.29f, 41.29f, 0.0f, false, false, 33.43f, -33.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.64f)
                close()
            }
        }
        .build()
        return _orange!!
    }

private var _orange: ImageVector? = null
