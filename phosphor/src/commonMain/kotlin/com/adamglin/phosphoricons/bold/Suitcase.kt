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

public val BoldGroup.Suitcase: ImageVector
    get() {
        if (_suitcase != null) {
            return _suitcase!!
        }
        _suitcase = Builder(name = "Suitcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                lineTo(180.0f, 48.0f)
                lineTo(180.0f, 40.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(104.0f, 12.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 40.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 68.0f)
                lineTo(20.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 48.0f)
                close()
                moveTo(100.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(8.0f)
                lineTo(100.0f, 48.0f)
                close()
                moveTo(156.0f, 72.0f)
                lineTo(156.0f, 192.0f)
                lineTo(100.0f, 192.0f)
                lineTo(100.0f, 72.0f)
                close()
                moveTo(44.0f, 72.0f)
                lineTo(76.0f, 72.0f)
                lineTo(76.0f, 192.0f)
                lineTo(44.0f, 192.0f)
                close()
                moveTo(212.0f, 192.0f)
                lineTo(180.0f, 192.0f)
                lineTo(180.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _suitcase!!
    }

private var _suitcase: ImageVector? = null
