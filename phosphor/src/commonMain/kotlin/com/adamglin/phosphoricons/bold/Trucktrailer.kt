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

public val BoldGroup.Trucktrailer: ImageVector
    get() {
        if (_trucktrailer != null) {
            return _trucktrailer!!
        }
        _trucktrailer = Builder(name = "Trucktrailer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 93.65f)
                arcTo(60.08f, 60.08f, 0.0f, false, false, 164.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(144.0f, 172.0f)
                lineTo(128.0f, 172.0f)
                lineTo(128.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(20.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 0.0f, 80.0f)
                lineTo(0.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 60.0f, 26.8f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 117.94f, 196.0f)
                horizontalLineToRelative(68.12f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 256.0f, 184.0f)
                lineTo(256.0f, 136.0f)
                arcTo(44.08f, 44.08f, 0.0f, false, false, 224.0f, 93.65f)
                close()
                moveTo(168.0f, 60.22f)
                arcTo(36.06f, 36.06f, 0.0f, false, true, 200.0f, 96.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(14.06f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 186.06f, 172.0f)
                lineTo(168.0f, 172.0f)
                close()
                moveTo(104.0f, 84.0f)
                verticalLineToRelative(70.08f)
                arcToRelative(35.92f, 35.92f, 0.0f, false, false, -44.0f, 3.12f)
                arcToRelative(35.93f, 35.93f, 0.0f, false, false, -36.0f, -7.14f)
                lineTo(24.0f, 84.0f)
                close()
                moveTo(36.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 36.0f, 196.0f)
                close()
                moveTo(84.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 196.0f)
                close()
                moveTo(220.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 196.0f)
                close()
            }
        }
        .build()
        return _trucktrailer!!
    }

private var _trucktrailer: ImageVector? = null
