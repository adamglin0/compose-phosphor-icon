package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Caretlineleft: ImageVector
    get() {
        if (_caretlineleft != null) {
            return _caretlineleft!!
        }
        _caretlineleft = Builder(name = "Caretlineleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 48.0f)
                verticalLineTo(208.0f)
                lineToRelative(-80.0f, -80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.06f, 40.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineToRelative(-80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 208.0f)
                verticalLineTo(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 195.06f, 40.61f)
                close()
                moveTo(184.0f, 188.69f)
                lineTo(123.31f, 128.0f)
                lineTo(184.0f, 67.31f)
                close()
                moveTo(80.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _caretlineleft!!
    }

private var _caretlineleft: ImageVector? = null
