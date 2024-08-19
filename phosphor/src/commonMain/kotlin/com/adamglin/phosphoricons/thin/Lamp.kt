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

public val ThinGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.68f, 150.42f)
                lineToRelative(-48.0f, -112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 36.0f)
                horizontalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.68f, 2.42f)
                lineToRelative(-48.0f, 112.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 156.0f)
                horizontalLineTo(124.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(156.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(156.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.68f, -5.58f)
                close()
                moveTo(22.07f, 148.0f)
                lineTo(66.64f, 44.0f)
                horizontalLineTo(189.36f)
                lineToRelative(44.57f, 104.0f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
