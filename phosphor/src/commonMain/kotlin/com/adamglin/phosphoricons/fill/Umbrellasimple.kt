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

public val FillGroup.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) {
            return _umbrellaSimple!!
        }
        _umbrellaSimple = Builder(name = "UmbrellaSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.76f, 138.83f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 144.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                verticalLineTo(144.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -17.37f)
                arcToRelative(112.44f, 112.44f, 0.0f, false, true, 188.2f, -72.88f)
                arcTo(111.56f, 111.56f, 0.0f, false, true, 240.0f, 126.63f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 235.76f, 138.83f)
                close()
            }
        }
        .build()
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
