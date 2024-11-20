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

public val BoldGroup.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(140.0f, 148.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 148.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(20.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 136.0f)
                close()
                moveTo(236.0f, 80.0f)
                lineTo(236.0f, 192.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(20.0f, 80.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 52.0f)
                lineTo(73.58f, 52.0f)
                lineTo(83.64f, 36.91f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 100.28f, 28.0f)
                horizontalLineToRelative(55.44f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 16.64f, 8.91f)
                lineTo(182.42f, 52.0f)
                lineTo(208.0f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
                moveTo(212.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(176.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, -5.34f)
                lineTo(153.58f, 52.0f)
                lineTo(102.42f, 52.0f)
                lineTo(90.0f, 70.66f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 76.0f)
                lineTo(48.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
