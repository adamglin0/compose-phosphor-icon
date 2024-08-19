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

public val BoldGroup.Greaterthan: ImageVector
    get() {
        if (_greaterthan != null) {
            return _greaterthan!!
        }
        _greaterthan = Builder(name = "Greaterthan", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.86f, 10.84f)
                lineToRelative(-152.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.27f, -21.69f)
                lineTo(188.0f, 128.0f)
                lineTo(58.87f, 66.85f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 69.14f, 45.16f)
                lineToRelative(152.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _greaterthan!!
    }

private var _greaterthan: ImageVector? = null
