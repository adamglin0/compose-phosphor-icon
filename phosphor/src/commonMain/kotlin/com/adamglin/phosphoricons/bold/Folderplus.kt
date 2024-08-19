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

public val BoldGroup.Folderplus: ImageVector
    get() {
        if (_folderplus != null) {
            return _folderplus!!
        }
        _folderplus = Builder(name = "Folderplus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(133.39f, 68.0f)
                lineToRelative(-26.0f, -29.29f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -15.0f, -6.71f)
                lineTo(40.0f, 32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 52.0f)
                lineTo(20.0f, 200.62f)
                arcTo(19.41f, 19.41f, 0.0f, false, false, 39.38f, 220.0f)
                lineTo(216.89f, 220.0f)
                arcTo(19.13f, 19.13f, 0.0f, false, false, 236.0f, 200.89f)
                lineTo(236.0f, 88.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(90.61f, 56.0f)
                lineToRelative(10.67f, 12.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 56.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                close()
                moveTo(140.0f, 120.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(140.0f, 156.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 156.0f)
                lineTo(104.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(116.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _folderplus!!
    }

private var _folderplus: ImageVector? = null
