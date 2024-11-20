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

public val BoldGroup.CaretDoubleRight: ImageVector
    get() {
        if (_caretDoubleRight != null) {
            return _caretDoubleRight!!
        }
        _caretDoubleRight = Builder(name = "CaretDoubleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.49f, 136.49f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(119.0f, 128.0f)
                lineTo(47.51f, 56.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(80.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 144.49f, 136.49f)
                close()
                moveTo(224.49f, 119.49f)
                lineTo(144.49f, 39.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f)
                lineTo(199.0f, 128.0f)
                lineToRelative(-71.52f, 71.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(80.0f, -80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.49f, 119.51f)
                close()
            }
        }
        .build()
        return _caretDoubleRight!!
    }

private var _caretDoubleRight: ImageVector? = null
