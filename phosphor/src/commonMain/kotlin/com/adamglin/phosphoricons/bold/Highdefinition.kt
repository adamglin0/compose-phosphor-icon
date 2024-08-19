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

public val BoldGroup.Highdefinition: ImageVector
    get() {
        if (_highdefinition != null) {
            return _highdefinition!!
        }
        _highdefinition = Builder(name = "Highdefinition", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 68.0f)
                lineTo(156.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, -120.0f)
                close()
                moveTo(180.0f, 164.0f)
                lineTo(168.0f, 164.0f)
                lineTo(168.0f, 92.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                close()
                moveTo(104.0f, 176.0f)
                lineTo(104.0f, 140.0f)
                lineTo(56.0f, 140.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(32.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(48.0f)
                lineTo(104.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(20.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(224.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(32.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 20.0f, 44.0f)
                close()
                moveTo(236.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(224.0f, 200.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 212.0f)
                close()
            }
        }
        .build()
        return _highdefinition!!
    }

private var _highdefinition: ImageVector? = null
