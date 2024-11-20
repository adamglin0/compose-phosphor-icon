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

public val BoldGroup.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 116.0f)
                horizontalLineTo(228.0f)
                verticalLineTo(48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -23.58f, -19.67f)
                lineToRelative(-160.0f, 29.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 77.09f)
                verticalLineTo(116.0f)
                horizontalLineTo(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(28.0f)
                verticalLineToRelative(38.91f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.42f, 19.67f)
                lineToRelative(160.0f, 29.09f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 228.0f, 208.0f)
                verticalLineTo(140.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(52.0f, 80.43f)
                lineTo(204.0f, 52.8f)
                verticalLineTo(116.0f)
                horizontalLineTo(52.0f)
                close()
                moveTo(204.0f, 203.2f)
                lineTo(52.0f, 175.57f)
                verticalLineTo(140.0f)
                horizontalLineTo(204.0f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
