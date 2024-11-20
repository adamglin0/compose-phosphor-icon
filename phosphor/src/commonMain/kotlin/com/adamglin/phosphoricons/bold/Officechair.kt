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

public val BoldGroup.OfficeChair: ImageVector
    get() {
        if (_officeChair != null) {
            return _officeChair!!
        }
        _officeChair = Builder(name = "OfficeChair", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(226.6f, 140.0f)
                arcTo(52.09f, 52.09f, 0.0f, false, true, 176.0f, 180.0f)
                lineTo(140.0f, 180.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(140.0f, 220.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 220.0f)
                lineTo(96.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(20.0f)
                lineTo(116.0f, 180.0f)
                lineTo(80.0f, 180.0f)
                arcToRelative(52.09f, 52.09f, 0.0f, false, true, -50.6f, -40.0f)
                lineTo(16.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(40.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(72.82f, 133.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -4.59f, -16.0f)
                lineTo(81.8f, 29.0f)
                arcToRelative(19.91f, 19.91f, 0.0f, false, true, 19.79f, -17.0f)
                horizontalLineToRelative(52.82f)
                arcTo(19.91f, 19.91f, 0.0f, false, true, 174.2f, 29.0f)
                lineToRelative(13.57f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 168.0f, 140.0f)
                lineTo(88.0f, 140.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.82f, 133.0f)
                close()
                moveTo(92.67f, 116.0f)
                horizontalLineToRelative(70.66f)
                lineTo(151.0f, 36.0f)
                lineTo(105.0f, 36.0f)
                close()
            }
        }
        .build()
        return _officeChair!!
    }

private var _officeChair: ImageVector? = null
