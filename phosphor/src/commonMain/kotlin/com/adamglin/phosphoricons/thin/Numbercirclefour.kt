package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Numbercirclefour: ImageVector
    get() {
        if (_numbercirclefour != null) {
            return _numbercirclefour!!
        }
        _numbercirclefour = Builder(name = "Numbercirclefour", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(160.0f, 148.0f)
                lineTo(148.0f, 148.0f)
                lineTo(148.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.16f, -2.46f)
                lineToRelative(-56.0f, 72.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 156.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(148.0f, 156.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(140.0f, 148.0f)
                lineTo(96.18f, 148.0f)
                lineTo(140.0f, 91.66f)
                close()
            }
        }
        .build()
        return _numbercirclefour!!
    }

private var _numbercirclefour: ImageVector? = null
