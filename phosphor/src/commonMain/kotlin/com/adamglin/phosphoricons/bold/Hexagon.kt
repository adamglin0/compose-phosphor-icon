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

public val BoldGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.6f, 62.64f)
                lineToRelative(-88.0f, -48.17f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f)
                verticalLineToRelative(95.62f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f)
                verticalLineTo(80.19f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.64f)
                close()
                moveTo(212.0f, 173.44f)
                lineToRelative(-84.0f, 46.0f)
                lineToRelative(-84.0f, -46.0f)
                verticalLineTo(82.56f)
                lineToRelative(84.0f, -46.0f)
                lineToRelative(84.0f, 46.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
