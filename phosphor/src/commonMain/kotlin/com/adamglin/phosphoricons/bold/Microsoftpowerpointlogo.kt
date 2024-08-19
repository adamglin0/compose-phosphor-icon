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

public val BoldGroup.Microsoftpowerpointlogo: ImageVector
    get() {
        if (_microsoftpowerpointlogo != null) {
            return _microsoftpowerpointlogo!!
        }
        _microsoftpowerpointlogo = Builder(name = "Microsoftpowerpointlogo", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(94.0f, 88.0f)
                lineTo(76.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                close()
                moveTo(94.0f, 124.0f)
                lineTo(88.0f, 124.0f)
                lineTo(88.0f, 112.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(136.0f, 20.0f)
                arcTo(108.16f, 108.16f, 0.0f, false, false, 59.27f, 52.0f)
                lineTo(40.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 72.0f)
                lineTo(20.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(55.5f, 200.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 136.0f, 20.0f)
                close()
                moveTo(136.0f, 44.0f)
                arcToRelative(84.12f, 84.12f, 0.0f, false, true, 83.13f, 72.0f)
                lineTo(164.0f, 116.0f)
                lineTo(164.0f, 72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(100.27f, 52.0f)
                arcTo(83.88f, 83.88f, 0.0f, false, true, 136.0f, 44.0f)
                close()
                moveTo(44.0f, 76.0f)
                horizontalLineToRelative(96.0f)
                lineTo(140.0f, 176.0f)
                lineTo(44.0f, 176.0f)
                close()
                moveTo(136.0f, 212.0f)
                arcToRelative(83.67f, 83.67f, 0.0f, false, true, -43.32f, -12.0f)
                lineTo(144.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(164.0f, 140.0f)
                horizontalLineToRelative(55.13f)
                arcTo(84.12f, 84.12f, 0.0f, false, true, 136.0f, 212.0f)
                close()
            }
        }
        .build()
        return _microsoftpowerpointlogo!!
    }

private var _microsoftpowerpointlogo: ImageVector? = null
