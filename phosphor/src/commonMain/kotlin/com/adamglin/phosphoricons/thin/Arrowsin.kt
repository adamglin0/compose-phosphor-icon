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

public val ThinGroup.Arrowsin: ImageVector
    get() {
        if (_arrowsin != null) {
            return _arrowsin!!
        }
        _arrowsin = Builder(name = "Arrowsin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 104.0f)
                lineTo(148.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(156.0f, 94.34f)
                lineToRelative(49.17f, -49.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineTo(161.66f, 100.0f)
                lineTo(192.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(152.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 104.0f)
                close()
                moveTo(104.0f, 148.0f)
                lineTo(64.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(94.34f, 156.0f)
                lineTo(45.17f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(100.0f, 161.66f)
                lineTo(100.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(108.0f, 152.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 148.0f)
                close()
                moveTo(161.66f, 156.0f)
                lineTo(192.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(152.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(156.0f, 161.66f)
                lineToRelative(49.17f, 49.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                close()
                moveTo(104.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(100.0f, 94.34f)
                lineTo(50.83f, 45.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(94.34f, 100.0f)
                lineTo(64.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(108.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 60.0f)
                close()
            }
        }
        .build()
        return _arrowsin!!
    }

private var _arrowsin: ImageVector? = null
