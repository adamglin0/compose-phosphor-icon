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

public val ThinGroup.Sortdescending: ImageVector
    get() {
        if (_sortdescending != null) {
            return _sortdescending!!
        }
        _sortdescending = Builder(name = "Sortdescending", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(48.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(48.0f, 68.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(184.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(184.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(226.83f, 85.17f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-40.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(180.0f, 57.66f)
                lineTo(180.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(188.0f, 57.66f)
                lineToRelative(33.17f, 33.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f)
                close()
            }
        }
        .build()
        return _sortdescending!!
    }

private var _sortdescending: ImageVector? = null
