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

public val BoldGroup.Paperplane: ImageVector
    get() {
        if (_paperplane != null) {
            return _paperplane!!
        }
        _paperplane = Builder(name = "Paperplane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.42f, 198.2f)
                lineToRelative(-0.06f, -0.09f)
                lineTo(145.3f, 30.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.82f, 0.0f)
                lineTo(14.58f, 198.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.06f, 28.65f)
                lineTo(128.0f, 196.67f)
                lineToRelative(89.36f, 30.18f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 6.69f, 1.15f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.37f, -29.8f)
                close()
                moveTo(140.0f, 175.39f)
                verticalLineTo(120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(55.39f)
                lineTo(40.72f, 200.82f)
                lineTo(127.89f, 48.06f)
                lineToRelative(87.37f, 152.75f)
                close()
            }
        }
        .build()
        return _paperplane!!
    }

private var _paperplane: ImageVector? = null
