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

public val BoldGroup.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) {
            return _umbrellaSimple!!
        }
        _umbrellaSimple = Builder(name = "UmbrellaSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.93f, 126.3f)
                arcTo(116.43f, 116.43f, 0.0f, false, false, 49.0f, 50.81f)
                arcToRelative(115.45f, 115.45f, 0.0f, false, false, -37.0f, 75.49f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 32.0f, 148.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -21.7f)
                close()
                moveTo(36.44f, 124.0f)
                arcTo(92.45f, 92.45f, 0.0f, false, true, 190.69f, 68.46f)
                arcTo(91.56f, 91.56f, 0.0f, false, true, 219.56f, 124.0f)
                close()
            }
        }
        .build()
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
