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

public val DuotoneGroup.Arrowbenddoubleupright: ImageVector
    get() {
        if (_arrowbenddoubleupright != null) {
            return _arrowbenddoubleupright!!
        }
        _arrowbenddoubleupright = Builder(name = "Arrowbenddoubleupright", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(176.0f, 104.0f)
                lineToRelative(-48.0f, 48.0f)
                verticalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 109.66f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(212.69f, 104.0f)
                lineTo(170.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 109.66f)
                close()
                moveTo(181.66f, 109.66f)
                lineTo(133.66f, 157.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 152.0f)
                lineTo(120.0f, 112.37f)
                arcTo(88.11f, 88.11f, 0.0f, false, false, 40.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(104.15f, 104.15f, 0.0f, false, true, 120.0f, 96.3f)
                lineTo(120.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(48.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 181.66f, 109.66f)
                close()
                moveTo(164.66f, 104.0f)
                lineTo(136.0f, 75.31f)
                verticalLineToRelative(57.38f)
                close()
            }
        }
        .build()
        return _arrowbenddoubleupright!!
    }

private var _arrowbenddoubleupright: ImageVector? = null
