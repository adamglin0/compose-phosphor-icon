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

public val BoldGroup.Quotes: ImageVector
    get() {
        if (_quotes != null) {
            return _quotes!!
        }
        _quotes = Builder(name = "Quotes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 72.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(96.0f, 156.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(120.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.0f, 52.0f)
                close()
                moveTo(96.0f, 132.0f)
                lineTo(44.0f, 132.0f)
                lineTo(44.0f, 76.0f)
                lineTo(96.0f, 76.0f)
                close()
                moveTo(216.0f, 52.0f)
                lineTo(156.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(236.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 52.0f)
                close()
                moveTo(212.0f, 132.0f)
                lineTo(160.0f, 132.0f)
                lineTo(160.0f, 76.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _quotes!!
    }

private var _quotes: ImageVector? = null
