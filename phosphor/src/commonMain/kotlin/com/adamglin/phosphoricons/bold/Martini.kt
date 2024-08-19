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

public val BoldGroup.Martini: ImageVector
    get() {
        if (_martini != null) {
            return _martini!!
        }
        _martini = Builder(name = "Martini", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.09f, 35.41f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 20.49f)
                lineTo(116.0f, 149.0f)
                verticalLineToRelative(55.0f)
                lineTo(88.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 204.0f)
                lineTo(140.0f, 149.0f)
                lineTo(240.48f, 48.49f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 243.09f, 35.41f)
                close()
                moveTo(203.0f, 52.0f)
                lineTo(191.0f, 64.0f)
                lineTo(65.0f, 64.0f)
                lineTo(53.0f, 52.0f)
                close()
                moveTo(128.0f, 127.0f)
                lineTo(89.0f, 88.0f)
                lineTo(167.0f, 88.0f)
                close()
            }
        }
        .build()
        return _martini!!
    }

private var _martini: ImageVector? = null
