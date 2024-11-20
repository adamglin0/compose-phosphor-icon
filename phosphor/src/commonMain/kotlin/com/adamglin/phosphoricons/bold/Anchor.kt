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

public val BoldGroup.Anchor: ImageVector
    get() {
        if (_anchor != null) {
            return _anchor!!
        }
        _anchor = Builder(name = "Anchor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                curveToRelative(0.0f, 21.86f, -11.41f, 25.95f, -35.16f, 32.42f)
                curveToRelative(-9.12f, 2.49f, -19.61f, 5.36f, -28.84f, 10.69f)
                verticalLineTo(132.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(140.0f)
                verticalLineTo(89.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -24.0f, 0.0f)
                verticalLineTo(108.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(55.11f)
                curveToRelative(-9.23f, -5.33f, -19.72f, -8.2f, -28.84f, -10.69f)
                curveTo(63.41f, 170.0f, 52.0f, 165.86f, 52.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                curveToRelative(0.0f, 41.17f, 30.54f, 49.5f, 52.84f, 55.58f)
                curveTo(104.59f, 206.05f, 116.0f, 210.14f, 116.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                curveToRelative(0.0f, -21.86f, 11.41f, -25.95f, 35.16f, -32.42f)
                curveTo(197.46f, 193.5f, 228.0f, 185.17f, 228.0f, 144.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 132.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 44.0f)
                close()
            }
        }
        .build()
        return _anchor!!
    }

private var _anchor: ImageVector? = null
