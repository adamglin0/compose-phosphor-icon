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

public val LightGroup.Numberthree: ImageVector
    get() {
        if (_numberthree != null) {
            return _numberthree!!
        }
        _numberthree = Builder(name = "Numberthree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 160.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -90.0f, 40.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.0f, -8.94f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 120.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineTo(156.0f, 54.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.8f, 9.6f)
                lineToRelative(-41.67f, 55.55f)
                arcTo(54.1f, 54.1f, 0.0f, false, true, 174.0f, 160.0f)
                close()
            }
        }
        .build()
        return _numberthree!!
    }

private var _numberthree: ImageVector? = null
