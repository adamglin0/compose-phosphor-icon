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

public val BoldGroup.Folderuser: ImageVector
    get() {
        if (_folderuser != null) {
            return _folderuser!!
        }
        _folderuser = Builder(name = "Folderuser", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.51f, 197.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -57.0f, 0.0f)
                arcToRelative(43.75f, 43.75f, 0.0f, false, false, -15.08f, 23.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.52f, 14.67f)
                arcTo(11.77f, 11.77f, 0.0f, false, false, 160.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.59f, -8.92f)
                curveTo(174.0f, 218.2f, 182.35f, 212.0f, 192.0f, 212.0f)
                reflectiveCurveToRelative(18.0f, 6.2f, 20.4f, 15.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.19f, -6.17f)
                arcTo(43.7f, 43.7f, 0.0f, false, false, 220.51f, 197.94f)
                close()
                moveTo(192.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 164.0f)
                close()
                moveTo(216.0f, 68.0f)
                lineTo(133.39f, 68.0f)
                lineToRelative(-26.0f, -29.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 92.41f, 32.0f)
                lineTo(40.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 52.0f)
                lineTo(20.0f, 200.61f)
                arcTo(19.41f, 19.41f, 0.0f, false, false, 39.38f, 220.0f)
                horizontalLineToRelative(73.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(44.0f, 68.0f)
                lineTo(44.0f, 56.0f)
                lineTo(90.61f, 56.0f)
                lineToRelative(10.67f, 12.0f)
                close()
            }
        }
        .build()
        return _folderuser!!
    }

private var _folderuser: ImageVector? = null
