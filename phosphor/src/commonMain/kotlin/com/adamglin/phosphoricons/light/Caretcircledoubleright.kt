package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CaretCircleDoubleRight: ImageVector
    get() {
        if (_caretCircleDoubleRight != null) {
            return _caretCircleDoubleRight!!
        }
        _caretCircleDoubleRight = Builder(name = "CaretCircleDoubleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.87f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 55.87f, 200.12f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.87f)
                close()
                moveTo(191.64f, 191.64f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 0.0f, -127.28f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 191.64f, 191.64f)
                close()
                moveTo(124.24f, 123.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(111.51f, 128.0f)
                lineTo(83.76f, 100.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
                moveTo(180.24f, 123.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(167.51f, 128.0f)
                lineToRelative(-27.75f, -27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleRight!!
    }

private var _caretCircleDoubleRight: ImageVector? = null
