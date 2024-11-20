package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) {
            return _cameraPlus!!
        }
        _cameraPlus = Builder(name = "CameraPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(132.0f, 140.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(124.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 136.0f)
                close()
                moveTo(228.0f, 80.0f)
                lineTo(228.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 60.0f)
                lineTo(77.86f, 60.0f)
                lineTo(90.3f, 41.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, -5.34f)
                horizontalLineToRelative(55.44f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 5.34f)
                lineTo(178.14f, 60.0f)
                lineTo(208.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 80.0f)
                close()
                moveTo(220.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(176.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.33f, -1.78f)
                lineTo(159.05f, 45.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 155.72f, 44.0f)
                lineTo(100.28f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 97.0f, 45.78f)
                lineTo(83.33f, 66.22f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 68.0f)
                lineTo(48.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 80.0f)
                lineTo(36.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
