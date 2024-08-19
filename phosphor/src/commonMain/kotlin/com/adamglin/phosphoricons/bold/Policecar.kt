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

public val BoldGroup.Policecar: ImageVector
    get() {
        if (_policecar != null) {
            return _policecar!!
        }
        _policecar = Builder(name = "Policecar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 100.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(204.72f, 54.08f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 187.36f, 44.0f)
                lineTo(68.64f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 51.28f, 54.08f)
                lineTo(25.0f, 100.0f)
                lineTo(16.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(68.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(88.0f, 180.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 124.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(71.0f, 68.0f)
                lineTo(185.0f, 68.0f)
                lineToRelative(18.28f, 32.0f)
                lineTo(52.68f, 100.0f)
                close()
                moveTo(64.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 180.0f)
                lineTo(64.0f, 180.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(192.0f, 196.0f)
                lineTo(192.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(212.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 124.0f)
                lineTo(212.0f, 124.0f)
                close()
                moveTo(92.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 20.0f)
                close()
            }
        }
        .build()
        return _policecar!!
    }

private var _policecar: ImageVector? = null
