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

public val ThinGroup.Listmagnifyingglass: ImageVector
    get() {
        if (_listmagnifyingglass != null) {
            return _listmagnifyingglass!!
        }
        _listmagnifyingglass = Builder(name = "Listmagnifyingglass", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(40.0f, 132.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(128.0f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(234.83f, 194.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineToRelative(-22.72f, -22.72f)
                arcToRelative(36.06f, 36.06f, 0.0f, true, true, 5.66f, -5.66f)
                lineToRelative(22.72f, 22.72f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 234.83f, 194.83f)
                close()
                moveTo(184.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 184.0f, 172.0f)
                close()
            }
        }
        .build()
        return _listmagnifyingglass!!
    }

private var _listmagnifyingglass: ImageVector? = null
