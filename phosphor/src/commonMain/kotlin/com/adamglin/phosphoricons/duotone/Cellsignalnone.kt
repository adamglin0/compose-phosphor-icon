package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.CellSignalNone: ImageVector
    get() {
        if (_cellSignalNone != null) {
            return _cellSignalNone!!
        }
        _cellSignalNone = Builder(name = "CellSignalNone", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.12f, 25.23f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.43f, 3.47f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 198.12f, 25.23f)
                close()
                moveTo(192.0f, 200.0f)
                horizontalLineTo(32.0f)
                lineTo(192.0f, 40.0f)
                close()
            }
        }
        .build()
        return _cellSignalNone!!
    }

private var _cellSignalNone: ImageVector? = null
