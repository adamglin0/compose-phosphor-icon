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

public val FillGroup.Caretlinedown: ImageVector
    get() {
        if (_caretlinedown != null) {
            return _caretlinedown!!
        }
        _caretlinedown = Builder(name = "Caretlinedown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.34f, 77.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 64.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 13.66f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                close()
                moveTo(208.0f, 184.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _caretlinedown!!
    }

private var _caretlinedown: ImageVector? = null
