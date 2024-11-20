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

public val FillGroup.CaretCircleDoubleDown: ImageVector
    get() {
        if (_caretCircleDoubleDown != null) {
            return _caretCircleDoubleDown!!
        }
        _caretCircleDoubleDown = Builder(name = "CaretCircleDoubleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.57f, 54.43f)
                arcTo(104.15f, 104.15f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.17f, 104.17f, 0.0f, false, false, 201.57f, 54.43f)
                close()
                moveTo(165.67f, 149.67f)
                lineTo(133.67f, 181.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, -11.32f)
                lineTo(128.0f, 164.71f)
                lineToRelative(26.35f, -26.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                close()
                moveTo(165.67f, 93.67f)
                lineTo(133.67f, 125.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, -11.32f)
                lineTo(128.0f, 108.68f)
                lineToRelative(26.35f, -26.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleDown!!
    }

private var _caretCircleDoubleDown: ImageVector? = null
